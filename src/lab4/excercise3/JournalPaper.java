package lab4.excercise3;

public class JournalPaper extends WrittenItem {
	private	String publishedYear;
	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	@Override
	void journalPaper() {
		System.out.println();
		System.out.println("journal details:");
		System.out.println("Journal Published year:"+getPublishedYear());
		
	}

	
}
