package org.gwtproject.dom.style.client;

public enum CssProperty {
  FLOAT {
    public String getJsName() {
      return "cssFloat";
    }
  },
  Z_INDEX {
    public String getJsName() {
      return "zIndex";
    }
  },
  WIDTH {
    public String getJsName() {
      return "width";
    }
  },
  VISIBILITY {
    public String getJsName() {
      return "visibility";
    }
  },
  TOP {
    public String getJsName() {
      return "top";
    }
  },
  TEXT_DECORATION {
    public String getJsName() {
      return "textDecoration";
    }
  },
  RIGHT {
    public String getJsName() {
      return "right";
    }
  },
  POSITION {
    public String getJsName() {
      return "position";
    }
  },
  PADDING_TOP {
    public String getJsName() {
      return "paddingTop";
    }
  },
  PADDING_RIGHT {
    public String getJsName() {
      return "paddingRight";
    }
  },
  PADDING_LEFT {
    public String getJsName() {
      return "paddingLeft";
    }
  },
  PADDING_BOTTOM {
    public String getJsName() {
      return "paddingBottom";
    }
  },
  PADDING {
    public String getJsName() {
      return "padding";
    }
  },
  OVERFLOW {
    public String getJsName() {
      return "overflow";
    }
  },
  OVERFLOW_X {
    public String getJsName() {
      return "overflowX";
    }
  },
  OVERFLOW_Y {
    public String getJsName() {
      return "overflowY";
    }
  },
  OPACITY {
    public String getJsName() {
      return "opacity";
    }
  },
  MARGIN_TOP {
    public String getJsName() {
      return "marginTop";
    }
  },
  MARGIN_RIGHT {
    public String getJsName() {
      return "marginRight";
    }
  },
  MARGIN_LEFT {
    public String getJsName() {
      return "marginLeft";
    }
  },
  MARGIN_BOTTOM {
    public String getJsName() {
      return "marginBottom";
    }
  },
  MARGIN {
    public String getJsName() {
      return "margin";
    }
  },
  LIST_TYPE {
    public String getJsName() {
      return "listStyleType";
    }
  },
  LEFT {
    public String getJsName() {
      return "left";
    }
  },
  HEIGHT {
    public String getJsName() {
      return "height";
    }
  },
  FONT_WEIGHT {
    public String getJsName() {
      return "fontWeight";
    }
  },
  FONT_STYLE {
    public String getJsName() {
      return "fontStyle";
    }
  },
  FONT_SIZE {
    public String getJsName() {
      return "fontSize";
    }
  },
  DISPLAY {
    public String getJsName() {
      return "display";
    }
  },
  CURSOR {
    public String getJsName() {
      return "cursor";
    }
  },
  COLOR {
    public String getJsName() {
      return "color";
    }
  },
  CLEAR {
    public String getJsName() {
      return "clear";
    }
  },
  BOTTOM {
    public String getJsName() {
      return "bottom";
    }
  },
  BORDER_WIDTH {
    public String getJsName() {
      return "borderWidth";
    }
  },
  BORDER_STYLE {
    public String getJsName() {
      return "borderStyle";
    }
  },
  BORDER_COLOR {
    public String getJsName() {
      return "borderColor";
    }
  },
  BACKGROUND_IMAGE {
    public String getJsName() {
      return "backgroundImage";
    }
  },
  BACKGROUND_COLOR {
    public String getJsName() {
      return "backgroundColor";
    }
  },
  VERTICAL_ALIGN {
    public String getJsName() {
      return "verticalAlign";
    }
  },
  TABLE_LAYOUT {
    public String getJsName() {
      return "tableLayout";
    }
  },
  TEXT_ALIGN {
    public String getJsName() {
      return "textAlign";
    }
  },
  TEXT_INDENT {
    public String getJsName() {
      return "textIndent";
    }
  },
  TEXT_JUSTIFY {
    public String getJsName() {
      return "textJustify";
    }
  },
  TEXT_OVERFLOW {
    public String getJsName() {
      return "textOverflow";
    }
  },
  TEXT_TRANSFORM {
    public String getJsName() {
      return "textTransform";
    }
  },
  OUTLINE_WIDTH {
    public String getJsName() {
      return "outlineWidth";
    }
  },
  OUTLINE_STYLE {
    public String getJsName() {
      return "outlineStyle";
    }
  },
  OUTLINE_COLOR {
    public String getJsName() {
      return "outlineColor";
    }
  },
  LINE_HEIGHT {
    public String getJsName() {
      return "lineHeight";
    }
  },
  WHITE_SPACE {
    public String getJsName() {
      return "whiteSpace";
    }
  };

  public abstract String getJsName();
}