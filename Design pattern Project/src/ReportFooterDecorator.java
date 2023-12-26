
class ReportFooterDecorator extends ReportDecorator {
    private final String additionalFooter;

    public ReportFooterDecorator(Report report, String additionalFooter) {
        super(report);
        this.additionalFooter = additionalFooter;
    }

    @Override
    public String generateContent() {
        return report.generateContent() + "\n" + additionalFooter;
    }
}