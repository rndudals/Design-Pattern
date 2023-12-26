public class Main {
    public static void main(String[] args) {
        ReportTypeStrategy strategy = new ReportType3Strategy();
        CoverFactory frontCoverFactory = new FrontCoverFactory();
        CoverFactory backCoverFactory = new BackCoverFactory();
        
        ReportGenerator reportGenerator = new ReportGenerator(strategy, frontCoverFactory, backCoverFactory);
        reportGenerator.generateReport();
    }
}