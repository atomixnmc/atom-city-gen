import java.awt.Color;

// turn on antialias
antialias( 'on' )
// create the Groovy star
star( ir: 40, or: 100, cx: 160, cy: 120, borderWidth: 4,fill: [118,167,183] as Color ){
   transformations{
      scale( y: 0.6 )
   }
}
// load the swingtime font, get it? Swing
def fontFile = new File("Arial.TTF")
font( Font.createFont(Font.TRUETYPE_FONT,fontFile).deriveFont(50.0f) )
// draw the text
text( text: 'Groovy', borderWidth: 4, fill: 'white' ){
   transformations{
       translate( x:80, y:30 )
       scale( y: 1.2 )
    }
}