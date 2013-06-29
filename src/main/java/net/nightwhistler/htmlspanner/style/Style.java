package net.nightwhistler.htmlspanner.style;

import net.nightwhistler.htmlspanner.FontFamily;

import java.lang.reflect.Field;

/**
 * CSS Style object.
 *
 * A Style is immutable: using a setter creates a new Style object with the
 * changed setings.
 */
public class Style {

    public static enum TextAlignment { LEFT, CENTER, RIGHT };
    public static enum FontWeight {  NORMAL, BOLD }
    public static enum FontStyle { NORMAL, ITALIC }
    public static enum DisplayStyle { BLOCK, INLINE };

    private final FontFamily fontFamily;
    private final TextAlignment textAlignment;
    private final StyleValue fontSize;

    private final FontWeight fontWeight;
    private final FontStyle fontStyle;

    private final Integer color;
    private final Integer backgroundColor;

    private final DisplayStyle displayStyle;

    private final StyleValue marginBottom;


    public Style() {
        fontFamily = null;
        textAlignment = null;
        fontSize = null;
        fontWeight = null;
        fontStyle = null;
        color = null;
        backgroundColor = null;
        displayStyle = null;
        marginBottom = null;
    }

    public Style(FontFamily family, TextAlignment textAlignment, StyleValue fontSize,
                 FontWeight fontWeight, FontStyle fontStyle, Integer color,
                 Integer backgroundColor, DisplayStyle displayStyle, StyleValue marginBottom ) {
        this.fontFamily = family;
        this.textAlignment = textAlignment;
        this.fontSize = fontSize;

        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.color = color;
        this.backgroundColor = backgroundColor;
        this.displayStyle = displayStyle;
        this.marginBottom = marginBottom;
    }

    public Style setFontFamily(FontFamily fontFamily) {
        return new Style(fontFamily, this.textAlignment, this.fontSize,
                this.fontWeight, this.fontStyle, this.color, this.backgroundColor, this.displayStyle,
                this.marginBottom );
    }


    public Style setTextAlignment(TextAlignment alignment) {
        return new Style(this.fontFamily, alignment, this.fontSize, this.fontWeight,
                this.fontStyle, this.color, this.backgroundColor, this.displayStyle, this.marginBottom );
    }

    public Style setFontSize(StyleValue fontSize) {
        return new Style(this.fontFamily, this.textAlignment, fontSize, this.fontWeight,
                this.fontStyle, this.color, this.backgroundColor, this.displayStyle, this.marginBottom );
    }

    public Style setFontWeight(FontWeight fontWeight) {
        return new Style(fontFamily, this.textAlignment, this.fontSize, fontWeight,
                this.fontStyle, this.color, this.backgroundColor, this.displayStyle, this.marginBottom);
    }

    public Style setFontStyle(FontStyle fontStyle) {
        return new Style(fontFamily, this.textAlignment, this.fontSize,
                this.fontWeight, fontStyle, this.color, this.backgroundColor
                , this.displayStyle, this.marginBottom);
    }

    public Style setColor(Integer color) {
        return new Style(fontFamily, this.textAlignment, this.fontSize,
                this.fontWeight, fontStyle, color, this.backgroundColor,
                this.displayStyle, this.marginBottom);
    }

    public Style setBackgroundColor( Integer bgColor ) {
        return new Style(fontFamily, this.textAlignment, this.fontSize,
                this.fontWeight, fontStyle, this.color, bgColor,
                this.displayStyle, this.marginBottom );
    }

    public Style setDisplayStyle( DisplayStyle displayStyle ) {
        return new Style(fontFamily, this.textAlignment, this.fontSize,
                this.fontWeight, fontStyle, this.color, this.backgroundColor,
                displayStyle, this.marginBottom );
    }

    public Style setMarginBottom( StyleValue marginBottom ) {
        return new Style(fontFamily, this.textAlignment, this.fontSize,
                this.fontWeight, fontStyle, this.color, this.backgroundColor,
                this.displayStyle, marginBottom );
    }

    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public TextAlignment getTextAlignment() {
        return textAlignment;
    }

    public StyleValue getFontSize() {
        return this.fontSize;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public FontStyle getFontStyle() {
        return fontStyle;
    }

    public Integer getColor() {
        return this.color;
    }

    public DisplayStyle getDisplayStyle() {
        return this.displayStyle;
    }

    public StyleValue getMarginBottom() {
        return this.marginBottom;
    }

    public String toString() {

        StringBuilder result = new StringBuilder( "{\n" );

        if ( fontFamily != null  ) {
            result.append( "  font-family: " + fontFamily.getName() + "\n");
        }

        if ( textAlignment != null ) {
            result.append( "  text-alignment: " + textAlignment + "\n");
        }

        if ( fontSize != null ) {
            result.append( "  font-size: " + fontSize + "\n");
        }

        if ( fontWeight != null ) {
            result.append( "  font-weight: " + fontWeight + "\n" );
        }

        if ( fontStyle != null ) {
            result.append( "  font-style: " + fontStyle + "\n" );
        }

        if ( color != null ) {
            result.append("  color: " + color + "\n");
        }

        if ( backgroundColor != null ) {
            result.append("  background-color: " + backgroundColor + "\n");
        }

        if ( displayStyle != null ) {
            result.append("  display: " + displayStyle + "\n");
        }

        if ( marginBottom != null ) {
            result.append("  margin-bottom: " + marginBottom + "\n" );
        }

        result.append("}\n");

        return result.toString();
    }

}
