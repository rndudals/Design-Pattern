
class ReportType2Strategy implements ReportTypeStrategy {
    @Override
    public String generateHeader() {
        return new HeaderType2().getHeaderType(); // 예시 머리말
    }

    @Override
    public String generateFooter() {
        return new FooterType2().getFooterType(); // 예시 꼬리말
    }
    public int getPrice() {
    	return new HeaderType2().getPrice() + new FooterType2().getPrice();
    }
    @Override
    public double getDiscount() {
        return 0.8; // 할인율
    }
}