import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "NavigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;

	public String moveToPage1() {
		return "page1";
	}

	public String moveToPage2() {
		return "page2";
	}

	public String moveToHomePage() {
		return "home";
	}

	public String processPage1() {
		return "page";
	}

	public String processPage2() {
		return "page";
	}
	
	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String returnPage(){
		
		
		if(pageId==null){
			return "index";
		}
		
		if (pageId.equals("1")){
			return "page1";
		}
		else if (pageId.equals("2")){
			return "page2";
		}
		else{
			return "index";
		}
	}

}
