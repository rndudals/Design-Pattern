
class ReportType1Strategy implements ReportTypeStrategy {
    @Override
    public String generateHeader() {
    	;
        return new HeaderType1().getHeaderType(); // 예시 머리말
    }

    @Override
    public String generateFooter() {
        return new FooterType1().getFooterType(); // 예시 꼬리말
    }

    public int getPrice() {
    	return new HeaderType1().getPrice() + new FooterType1().getPrice();
    }
    @Override
    public double getDiscount() {
        return 0.9; // 할인율
    }
}