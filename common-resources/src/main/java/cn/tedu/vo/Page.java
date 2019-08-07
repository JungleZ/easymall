package cn.tedu.vo;


import java.util.List;


/**
 * @author hongziheng
 *
 */
public class Page<T> {
	//总页数
	private Integer totalPage;
	//当前页数
	private Integer currentPage;
	//查询分页结果
	private List<T> t;
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public List<T> getProducts() {
		return t;
	}
	public void setProducts(List<T> t) {
		this.t = t;
	}
	
}
