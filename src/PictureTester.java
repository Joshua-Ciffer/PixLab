import java.awt.Color;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods. Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {

	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("../assets/beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/** Method to test zeroRed */
	public static void testZeroRed() {
		Picture beach = new Picture("../assets/beach.jpg");
		beach.explore();
		beach.zeroRed();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("../assets/caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("../assets/temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("../assets/640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("../assets/swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/** Converts to black and white */
	public static void convertToBlackAndWhite() {
		Picture pic = new Picture("../assets/femaleLionAndHall.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		for (Pixel[] pixelsRow : picPixels) {
			for (Pixel pixel : pixelsRow) {
				int averageColor = (int)pixel.getAverage();
				pixel.setRed(averageColor);
				pixel.setGreen(averageColor);
				pixel.setBlue(averageColor);
			}
		}
		pic.explore();
	}

	/** Adjusts the brightness of the picture */
	public static void adjustBrightness(double brightnessPercentage) {
		Picture pic = new Picture("../assets/koala.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		for (Pixel[] pixelsRow : picPixels) {
			for (Pixel pixel : pixelsRow) {
				if ((pixel.getRed() * brightnessPercentage) > 255) {
					brightnessPercentage -= .1;
				}
				pixel.setRed((int)(pixel.getRed() * brightnessPercentage));
				if ((pixel.getGreen() * brightnessPercentage) > 255) {
					brightnessPercentage -= .1;
				}
				pixel.setGreen((int)(pixel.getGreen() * brightnessPercentage));
				if ((pixel.getBlue() * brightnessPercentage) > 255) {
					brightnessPercentage -= .1;
				}
				pixel.setBlue((int)(pixel.getBlue() * brightnessPercentage));
			}
		}
		pic.explore();
	}

	/** Mirrors the image vertically. */
	public static void verticalMirror() {
		Picture pic = new Picture("../assets/redMotorcycle.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		Pixel leftPixel;
		Pixel rightPixel;
		for (int row = 0; row < picPixels.length; row++) {
			for (int col = 0; col < picPixels[row].length; col++) {
				leftPixel = picPixels[row][col];
				rightPixel = picPixels[row][picPixels[row].length - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		pic.explore();
	}

	/** Mirrors the image horizontally. */
	public static void horizontallyMirror() {
		Picture pic = new Picture("../assets/redMotorcycle.jpg");
		pic.explore();
		Pixel[][] picPixels = pic.getPixels2D();
		Pixel leftPixel;
		Pixel rightPixel;
		for (int row = 0; row < picPixels.length; row++) {
			for (int col = 0; col < picPixels[row].length; col++) {
				leftPixel = picPixels[row][col];
				rightPixel = picPixels[picPixels.length - 1 - row][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
		pic.explore();
	}

	/** Flip the image horizontally. */
	public static void flipHorizontally() {
		Picture pic1 = new Picture("../assets/butterfly1.jpg");
		pic1.explore();
		Picture pic2 = new Picture(pic1);
		Pixel[][] pixels = pic2.getPixels2D();
		Pixel leftPixel, rightPixel, tempPixel;
		Color tempColor;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[row].length / 2; col++) {
				rightPixel = pixels[row][col];
				leftPixel = pixels[row][pixels[row].length - 1 - col];
			}
		}
		pic2.explore();
		
//		int mirrorPoint = 276;
//		Pixel leftPixel = null;
//		Pixel rightPixel = null;
//		int count = 0;
//		Pixel[][] pixels = this.getPixels2D();
//
//		// loop through the rows
//		for (int row = 27; row < 97; row++) {
//			// loop from 13 to just before the mirror point
//			for (int col = 13; col < mirrorPoint; col++) {
//
//				leftPixel = pixels[row][col];
//				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
//				rightPixel.setColor(leftPixel.getColor());
//			}
//		}
//		
//		Pixel[][] pixels = this.getPixels2D();
//		Pixel leftPixel = null;
//		Pixel rightPixel = null;
//		int width = pixels[0].length;
//		for (int row = 0; row < pixels.length; row++) {
//			for (int col = 0; col < width / 2; col++) {
//				leftPixel = pixels[row][col];
//				rightPixel = pixels[row][width - 1 - col];
//				rightPixel.setColor(leftPixel.getColor());
//			}
//		}
	}
	
	/** Flip the image horizontally. */

	/**
	 * Main method for testing. Every class can have a main
	 * method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test and comment out the ones you don't want to run
		// testZeroBlue();
		// testZeroRed();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
		// convertToBlackAndWhite();
		// adjustBrightness(.8);
		// verticalMirror();
		// horizontallyMirror();
		flipHorizontally();
	}
}