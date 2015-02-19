package hello.controller;

import hello.service.UserServiceImpl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileDownloadController {
	@Value("#{'${application.resumes.location}'}")
	private String resumesFolder;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserServiceImpl.class);

	@RequestMapping(value = "/resume/{file_name}", method = RequestMethod.GET)
	public void handleFiledownload(@PathVariable("file_name") String fileName,
			HttpServletResponse response) {
		fileName = resumesFolder+File.separator+fileName+".doc";
		System.out.println("Hellllllllffffffffffffffffffff" + fileName);
		try {
			response.setContentType("application/doc");
			File f = new File(fileName);
			System.out.println("File Status= "+f.exists());
			LOGGER.debug("File Status= "+f.exists());
			InputStream is = new FileInputStream(fileName);
			IOUtils.copy(is, response.getOutputStream());
			response.flushBuffer();
		} catch (FileNotFoundException e) {
			LOGGER.debug("Error writing file to output stream. Filename was '"
					+ fileName + "'");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}