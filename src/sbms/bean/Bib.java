package sbms.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bib {

	private String title;
	private String author;
	private String year;
	private String isbn;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public void importBib(){
		System.out.print("title:"+title );
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
