package day13;

public class Librarymanagement {
public String Bookname;
public int  studentid;
public int Bookprice;
public String AuthorName;

	public String getBookname() {
	return Bookname;
}

public void setBookname(String bookname) {
	Bookname = bookname;
}

public int getStudentid() {
	return studentid;
}

public void setStudentid(int studentid) {
	this.studentid = studentid;
}

public int getBookprice() {
	return Bookprice;
}

public void setBookprice(int bookprice) {
	Bookprice = bookprice;
}

public String getAuthorName() {
	return AuthorName;
}

public void setAuthorName(String authorName) {
	AuthorName = authorName;
}

	public Librarymanagement(String bookname, int studentid, int bookprice, String authorName) {
	super();
	Bookname = bookname;
	this.studentid = studentid;
	Bookprice = bookprice;
	AuthorName = authorName;
}

	
	@Override
	public String toString() {
		return "Librarymanagement [Bookname=" + Bookname + ", studentid=" + studentid + ", Bookprice=" + Bookprice
				+ ", AuthorName=" + AuthorName + "]";
	}
	public Librarymanagement() {
		
	}
}
