package com.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

@WebServlet("/test1")
public class test extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String Path = null;
			Configuration localConf = new Configuration();
			FileSystem localSystem = FileSystem.getLocal(localConf);
			Path localPath = new Path("C:\\Users\\GD7\\Desktop\\data\\");
			FileStatus[] fileList = localSystem.listStatus(localPath);
			for(int i = 0; i < fileList.length; i++) {
				Path = fileList[i].getPath().getName();
				System.out.println(Path);
			}		
	}
}
