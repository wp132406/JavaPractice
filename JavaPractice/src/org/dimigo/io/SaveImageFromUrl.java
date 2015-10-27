/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   └SaveImageFromUrl
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class SaveImageFromUrl {
	
	public static void main(String[] args) throws Exception {
		
		String imageUrl = "http://i.ytimg.com/vi/lkzCStrHwcU/maxresdefault.jpg?width=70%http://www.coldplay.com/livetransmissions/298_med_20120907171927.jpg";
		
		
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");	// Actually, NOT LOGO
			
			// write
			
			byte[] buf = new byte[100];	// 100씩 끊어서 가지고 옴
			int result;
			
			while((result = is.read(buf)) != -1)
			{
				os.write(buf, 0, result);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
