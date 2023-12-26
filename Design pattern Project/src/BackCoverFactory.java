
class BackCoverFactory implements CoverFactory {
    @Override
    public Cover createCover() {
        return new BackCover1(); // 예시로 뒤표지 생성
    }
    public int getPrice() {
    	return new BackCover1().getPrice();
    }
}
