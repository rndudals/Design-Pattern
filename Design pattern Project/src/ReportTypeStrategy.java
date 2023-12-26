
interface ReportTypeStrategy {
    String generateHeader();
    String generateFooter();
    public int getPrice();
    double getDiscount();
}