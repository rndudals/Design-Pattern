
class ReportType3Strategy implements ReportTypeStrategy {
    @Override
    public String generateHeader() {
        return new HeaderType3().getHeaderType(); // 예시 머리말
    }

    @Override
    public String generateFooter() {
        return new FooterType3().getFooterType(); // 예시 꼬리말
    }
    public int getPrice() {
    	return new HeaderType3().getPrice() + new FooterType3().getPrice();
    }

    @Override
    public double getDiscount() {
        return 0.7; // 할인율
    }
}