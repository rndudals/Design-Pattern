
class FrontCoverFactory implements CoverFactory {
    @Override
    public Cover createCover() {
        return new FrontCover2(); // 예시로 앞표지 생성
    }
    public int getPrice() {
    	return new FrontCover2().getPrice();
    }
}
