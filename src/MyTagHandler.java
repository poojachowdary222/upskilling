import javax.servlet.jsp.JspException;
public class MyTagHandler {
	public int doStartTag() throws JspException{
		JspWriter out=pageContext.getOut();
	
		try {
			out.print(Calender.getInstance().getTime());
		} catch (Exception e) {

			System.out.println(e);
		}
			return SKIP_BODY;
		
	}

}
