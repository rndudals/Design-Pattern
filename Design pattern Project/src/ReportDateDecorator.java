
class ReportDateDecorator extends ReportDecorator {
    private final String additionalFooter;

    public ReportDateDecorator(Report report, String additionalFooter) {
        super(report);
        this.additionalFooter = additionalFooter;
    }

    @Override
    public String generateContent() {
        return report.generateContent() + "\n" + "꼬리말 옵션 Date : 2023/12/05";
    }
}