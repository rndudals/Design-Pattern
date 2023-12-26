

class ReportTitleDecorator extends ReportDecorator {
    private final String additionalFooter;

    public ReportTitleDecorator(Report report, String additionalFooter) {
        super(report);
        this.additionalFooter = additionalFooter;
    }

    @Override
    public String generateContent() {
        return report.generateContent() + "\n" + "꼬리말 옵션 Title : title";
    }
}