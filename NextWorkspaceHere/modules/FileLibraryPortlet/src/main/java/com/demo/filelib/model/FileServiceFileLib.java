package com.demo.filelib.model;

import java.util.ArrayList;
import java.util.Arrays;

public class FileServiceFileLib {

	
	ArrayList<String> ar;
	public FileServiceFileLib() {
		String []ex={"3g2","3g2","3gp","3gp","ai","ai","air","air","asf","asf","avi","avi","bib","bib","cls","cls","csv","csv","deb","deb","djvu","djvu","dmg","dmg","doc","doc","docx","docx","dwf","dwf","dwg","dwg","eps","eps","epub","epub","exe","exe","f","f","f77","f77","f90","f90","flac","flac","flv","flv","gif","gif","gz","gz","ico","ico","indd","indd","iso","iso","jar","jpeg","jpeg","jpg","jpg","key","key","log","log","m4a","m4a","m4v","m4v","midi","midi","mkv","mkv","mov","mov","mp3","mp3","mp4","mp4","mpeg","mpeg","mpg","mpg","msi","msi","odp","odp","ods","ods","odt","odt","oga","oga","ogg","ogg","ogv","ogv","pdf","pdf","png","png","pps","pps","ppsx","ppsx","ppt","ppt","pptx","pptx","psd","psd","pub","pub","py","py","qt","qt","ra","ra","ram","ram","rar","rar","rm","rm","rpm","rpm","rtf","rtf","rv","rv","skp","skp","spx","spx","sql","sql","sty","sty","tar","tar","tex","tex","tgz","tgz","tiff","tiff","ttf","ttf","txt","txt","vob","vob","wav","wav","wmv","wmv","xls","xls","xlsx","xlsx","xml","xml","xpi","xpi","zip","zip"};
		ar=new ArrayList<String>(Arrays.asList(ex));
	}
	public boolean finder(String ext){
		return ar.contains(ext);
	}
	
}
