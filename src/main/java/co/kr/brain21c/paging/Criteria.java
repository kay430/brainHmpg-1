package co.kr.brain21c.paging;

public class Criteria {

	private int currentPageNo; // 현재 페이지 번호
	private int recordsPerPage; // 페이지마다 출력할 데이터 개수
	private int pageSize; // 화면 하단에 출력할 페이지 크기
	private String searchKeyword; // 검색 키워드
	//private String searchType; // 검색 유형
	
	public Criteria() {
		this.currentPageNo = 1;
		this.recordsPerPage = 15;
		this.pageSize = 10;
	}
	
	
	public int getStartPage() { //LIMIT 구문 앞부분에 사용
		return (currentPageNo - 1) * recordsPerPage;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	/*
	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	
	*/
	
	
}
