class ReportGenerator {
    private final ReportTypeStrategy reportTypeStrategy;
    private final CoverFactory frontCoverFactory;
    private final CoverFactory backCoverFactory;

    public ReportGenerator(ReportTypeStrategy reportTypeStrategy, CoverFactory frontCoverFactory, CoverFactory backCoverFactory) {
        this.reportTypeStrategy = reportTypeStrategy;
        this.frontCoverFactory = frontCoverFactory;
        this.backCoverFactory = backCoverFactory;
    }

    public void generateReport() {
        Cover frontCover = frontCoverFactory.createCover();
        Cover backCover = backCoverFactory.createCover();

        String header = reportTypeStrategy.generateHeader();
        String footer = reportTypeStrategy.generateFooter();
        
        double discountRate = reportTypeStrategy.getDiscount();
        int price = reportTypeStrategy.getPrice() + frontCoverFactory.getPrice() + backCoverFactory.getPrice();
        Report baseReport = new BaseReport();
        Report decoratedReport = new ReportTitleDecorator(new ReportDateDecorator( (new ReportFooterDecorator(baseReport, footer)), footer), footer);

        System.out.println(frontCover.getPageType());
        for (int i = 0; i < 2; i++) {
            System.out.println();
            System.out.println(header);
            System.out.println(decoratedReport.generateContent());
            System.out.println();
        }
        System.out.println(backCover.getPageType());
        System.out.println("Discount Rate: " + discountRate*price);
    }
}