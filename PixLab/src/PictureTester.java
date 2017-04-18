/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  // Logan Stucki
  // Activity 8

  public static void testMyCollage() {
    Picture p = new Picture("images/kitten2.jpg");
    p.explore();
    p.myCollage();
    p.explore();
  }

  public static void testNewCopy() {
    Picture p = new Picture("images/flower1.jpg");
    Picture p2 = new Picture("images/flower2.jpg");
    p.explore();
    p.copy(p2, 10, 10, 10, 10, 60, 50);
    p.explore();
  }

  // Logan Stucki
  // Activity 7

  public static void testMirrorGull() {
    Picture p = new Picture("images/seagull.jpg");
    p.explore();
    p.mirrorGull();
    p.explore();
  }

  public static void testMirrorArms() {
    Picture p = new Picture("images/snowman.jpg");
    p.mirrorArms();
    p.explore();
  }

  // Logan Stucki
  // Activity 6

  public static void testMirrorDiagonal() {
    Picture p = new Picture("images/redMotorcycle.jpg");
    p.explore();
    p.mirrorDiagonal();
    p.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture p = new Picture("images/redMotorcycle.jpg");
    p.explore();
    p.mirrorHorizontalBotToTop();
    p.explore();
  }

  public static void testMirrorHorizontal() {
    Picture p = new Picture("images/redMotorcycle.jpg");
    p.explore();
    p.mirrorHorizontal();
    p.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture p = new Picture("images/redMotorcycle.jpg");
    p.explore();
    p.mirrorVerticalRightToLeft();
    p.explore();
  }

  // Activity 5 below

  public static void testGrayscale() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testKeepOnlyBlue() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture beach = new Picture("images/water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }

  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testMyCollage();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorVerticalRightToLeft();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}