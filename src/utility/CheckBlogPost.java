package utility;

import java.util.Arrays;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String[] badwords = {"2 girls 1 cup","2g1c","4r5e","5h1t","5hit","a$$","a$$hole","a_s_s","a2m","a54","a55","a55hole","acrotomophilia\r\n" + 
			"			aeolus\r\n" + 
			"			ahole\r\n" + 
			"			alabama hot pocket\r\n" + 
			"			alaskan pipeline\r\n" + 
			"			anal\r\n" + 
			"			anal impaler\r\n" + 
			"			anal leakage\r\n" + 
			"			analprobe\r\n" + 
			"			anilingus\r\n" + 
			"			anus\r\n" + 
			"			apeshit\r\n" + 
			"			ar5e\r\n" + 
			"			areola"
			};	
	public boolean checkBlogTitle(Blog blog) {
		boolean contains = Arrays.stream(badwords).anyMatch(blog.getBlogTitle()::equals);
		contains = !contains;
		return contains;
	}

	public boolean checkBlogDescription(Blog blog) {
		boolean val = Arrays.stream(badwords).anyMatch(blog.getBlogDescription()::equals);
		val = !val;
		return val;
	}

	public boolean checkBlog(Blog blog) {
		boolean flag = (checkBlogTitle(blog) && checkBlogDescription(blog));
		return flag;
	}
	
}