/*
 Developed an algorithm to remove near duplicate using Euclidean Distance formula.
*/
package com.jpeg.parse;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

import javax.imageio.ImageIO;

import org.apache.tika.metadata.Metadata;

import com.drew.imaging.ImageMetadataReader;

public class TestIntensity {
	public static void main(String[] args) throws IOException {
		BufferedImage img_first = ImageIO.read(new File("gun.png")); //requires path to image 1
		BufferedImage img_second = ImageIO.read(new File("sniper.jpg")); //requires path to image 2
		int[] point = new int[10];

		Double sum = 0.0;
		
		//Generating random points on image
		Random randomGenerator = new Random();
	    for (int i = 0; i < 10; i++){
	       point[i] = randomGenerator.nextInt(100);  
	    }
		
	    for (int i = 0; i < point.length; i++) {
	    	for (int j = 0; j < point.length; j++) {
	    		
	    		
	    		int width = 180;
	    		int height = 120;
	    		//Stacking images to same size as 180 * 120
	    		BufferedImage resizedImage_first = new BufferedImage(width, height, img_first.getType());
	    		Graphics2D g_first = resizedImage_first.createGraphics();
	    		g_first.drawImage(img_first, 0, 0, width, height, null);
	    		
	    		
	    		BufferedImage resizedImage_second = new BufferedImage(width, height, img_second.getType());
	    		Graphics2D g_second = resizedImage_second.createGraphics();
	    		g_second.drawImage(img_second, 0, 0, width, height, null);
	    		
	    		
	    		
	    		
	    		
	    		int sRbgColor_first = resizedImage_first.getRGB(point[i], point[j]);
	    		Color c_first = new Color(sRbgColor_first);
	    		int red = c_first.getRed();
	    		int green = c_first.getGreen();
	    		int blue = c_first.getBlue();
	   
	    		Vector v = new Vector(3);
	    		v.add(red);
	    		v.add(green);
	    		v.add(blue);
	    		
	    		
	    		int sRbgColor_second = resizedImage_second.getRGB(point[i], point[j]);
	    		Color c_second = new Color(sRbgColor_second);
	    		int red_second = c_second.getRed();
	    		int green_second = c_second.getGreen();
	    		int blue_second = c_second.getBlue();
	 
	    		Vector v_second = new Vector(3);
	    		v_second.add(red_second);
	    		v_second.add(green_second);
	    		v_second.add(blue_second);
	    		
	    		Double a=(double) Math.abs(red_second-red);
	    		Double b=(double) Math.abs(green_second-green);
	    		Double c=(double) Math.abs(blue_second-blue);
	    		Double divisor= (Double) Math.sqrt((255*255)+(255*255)+(255*255));
	    		//computing distance between pixels
	    		Double Distance = (Double) Math.sqrt((a*a)+(b*b)+(c*c));
	    		Double distancepercentage = (Double)(Distance/divisor);
	    		//computing sum of distance in percentage
	    		sum += distancepercentage; 
	    		
				
			}
			
		}
	 
	 int avgpercentage  = (int)((sum/100)*100);
	    
	 if(avgpercentage<3)
	    {
	    	System.out.println("Images are Duplicate");
	    }
	    else
	    {
	    	System.out.println("Images are not Duplicate");
	    }	
		
	}
}



