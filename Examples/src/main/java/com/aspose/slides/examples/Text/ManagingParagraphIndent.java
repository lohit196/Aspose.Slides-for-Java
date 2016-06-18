package com.aspose.slides.examples.Text;

import com.aspose.slides.BulletType;
import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.TextAlignment;
import com.aspose.slides.TextAutofitType;
import com.aspose.slides.examples.Utils;

public class ManagingParagraphIndent {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ManagingParagraphIndent.class);

		// Instantiate Presentation Class
		Presentation pres = new Presentation();

		// Get first slide
		ISlide sld = pres.getSlides().get_Item(0);

		// Add a Rectangle Shape
		IAutoShape rect = sld.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 500, 150);

		// Add TextFrame to the Rectangle
		ITextFrame tf = rect.addTextFrame("This is first line \rThis is second line \rThis is third line");

		// Set the text to fit the shape
		tf.getTextFrameFormat().setAutofitType(TextAutofitType.Shape);

		// Hide the lines of the Rectangle
		rect.getLineFormat().getFillFormat().setFillType(FillType.Solid);

		// Get first Paragraph in the TextFrame and set its Indent
		IParagraph para1 = tf.getParagraphs().get_Item(0);

		// Setting paragraph bullet style and symbol
		para1.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para1.getParagraphFormat().getBullet().setChar((char) (8226));
		para1.getParagraphFormat().setAlignment(TextAlignment.Left);

		para1.getParagraphFormat().setDepth((short) 2);
		para1.getParagraphFormat().setIndent(30);

		// Get second Paragraph in the TextFrame and set its Indent
		IParagraph para2 = tf.getParagraphs().get_Item(1);
		para2.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para2.getParagraphFormat().getBullet().setChar((char) (8226));
		para2.getParagraphFormat().setAlignment(TextAlignment.Left);
		para2.getParagraphFormat().setDepth((short) 2);
		para2.getParagraphFormat().setIndent(40);

		// Get third Paragraph in the TextFrame and set its Indent
		IParagraph para3 = tf.getParagraphs().get_Item(2);
		para3.getParagraphFormat().getBullet().setType(BulletType.Symbol);
		para3.getParagraphFormat().getBullet().setChar((char) (8226));
		para3.getParagraphFormat().setAlignment(TextAlignment.Left);
		para3.getParagraphFormat().setDepth((short) 2);
		para3.getParagraphFormat().setIndent(50);

		// Write the Presentation to disk
		pres.save(dataDir + "InOutDent.pptx", SaveFormat.Pptx);

	}

}
