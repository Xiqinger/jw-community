package org.joget.apps.userview.lib;

import org.joget.apps.app.service.AppUtil;
import org.joget.apps.userview.model.UserviewBuilderPalette;
import org.joget.apps.userview.model.UserviewMenu;

public class HtmlPage extends UserviewMenu {

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getLabel() {
        return "HTML Page";
    }

    @Override
    public String getIcon() {
        return "<i><span style=\"font-size: 60%;top: -9px;font-weight: bold;\">HTML</span></i>";
    }

    @Override
    public String getRenderPage() {
        String html = getEditorCss() + "<div class=\"ui-html ql-editor\">"
            + getPropertyString("content")
            + "<div class=\"ui-html-footer\"></div>"
            + "</div>";
        return html;
    }

    public String getName() {
        return "HTML Page Menu";
    }

    public String getVersion() {
        return "5.0.0";
    }

    public String getDescription() {
        return "";
    }

    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClass().getName(), "/properties/userview/htmlPage.json", null, true, "message/userview/htmlPage");
    }

    @Override
    public String getDecoratedMenu() {
        return null;
    }

    @Override
    public boolean isHomePageSupported() {
        return true;
    }

    @Override
    public String getCategory() {
        return UserviewBuilderPalette.CATEGORY_GENERAL;
    }
    
    protected String getEditorCss() {
        String css = "<style>.ql-editor > * {" +
            "  cursor: text;" +
            "}" +
            ".ql-editor p," +
            ".ql-editor ol," +
            ".ql-editor ul," +
            ".ql-editor pre," +
            ".ql-editor blockquote," +
            ".ql-editor h1," +
            ".ql-editor h2," +
            ".ql-editor h3," +
            ".ql-editor h4," +
            ".ql-editor h5," +
            ".ql-editor h6 {" +
            "  counter-reset: list-1 list-2 list-3 list-4 list-5 list-6 list-7 list-8 list-9;" +
            "}" + 
            ".ql-editor blockquote {" +
            "  border-left: 4px solid #ccc;" +
            "  margin-bottom: 5px;" +
            "  margin-top: 5px;" +
            "  padding-left: 16px;" +
            "}" +
            ".ql-editor code," +
            ".ql-editor pre {" +
            "  background-color: #f0f0f0;" +
            "  border-radius: 3px;" +
            "}" +
            ".ql-editor pre {" +
            "  white-space: pre-wrap;" +
            "  margin-bottom: 5px;" +
            "  margin-top: 5px;" +
            "  padding: 5px 10px;" +
            "}" +
            ".ql-editor code {" +
            "  font-size: 85%;" +
            "  padding: 2px 4px;" +
            "}" +
            ".ql-editor pre.ql-syntax {" +
            "  background-color: #23241f;" +
            "  color: #f8f8f2;" +
            "  overflow: visible;" +
            "}" +
            ".ql-editor ol > li[class*='ql-indent']," +
            ".ql-editor ul > li[class*='ql-indent'] {" +
            "  list-style-type: none !important;" +
            "}" +
            ".ql-editor ul > li[class*='ql-indent']::before {" +
            "  content: '\\2022';" +
            "}" +
            ".ql-editor ul[data-checked=true]," +
            ".ql-editor ul[data-checked=false] {" +
            "  pointer-events: none;" +
            "}" +
            ".ql-editor ul[data-checked=true] > li *," +
            ".ql-editor ul[data-checked=false] > li * {" +
            "  pointer-events: all;" +
            "}" +
            ".ql-editor ul[data-checked=true] > li[class*='ql-indent']::before," +
            ".ql-editor ul[data-checked=false] > li[class*='ql-indent']::before {" +
            "  color: #777;" +
            "  cursor: pointer;" +
            "  pointer-events: all;" +
            "}" +
            ".ql-editor ul[data-checked=true] > li::before {" +
            "  content: '\\2611';" +
            "}" +
            ".ql-editor ul[data-checked=false] > li::before {" +
            "  content: '\\2610';" +
            "}" +
            ".ql-editor li[class*='ql-indent']::before {" +
            "  display: inline-block;" +
            "  white-space: nowrap;" +
            "  width: 1.2em;" +
            "}" +
            ".ql-editor li[class*='ql-indent']:not(.ql-direction-rtl)::before {" +
            "  margin-left: -1.5em;" +
            "  margin-right: 0.3em;" +
            "  text-align: right;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-direction-rtl::before {" +
            "  margin-left: 0.3em;" +
            "  margin-right: -1.5em;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent']:not(.ql-direction-rtl)," +
            ".ql-editor ul li[class*='ql-indent']:not(.ql-direction-rtl) {" +
            "  padding-left: 1.5em;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-direction-rtl," +
            ".ql-editor ul li[class*='ql-indent'].ql-direction-rtl {" +
            "  padding-right: 1.5em;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'] {" +
            "  counter-reset: list-1 list-2 list-3 list-4 list-5 list-6 list-7 list-8 list-9;" +
            "  counter-increment: list-0;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent']:before {" +
            "  content: counter(list-0, decimal) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-1 {" +
            "  counter-increment: list-1;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-1:before {" +
            "  content: counter(list-1, lower-alpha) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-1 {" +
            "  counter-reset: list-2 list-3 list-4 list-5 list-6 list-7 list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-2 {" +
            "  counter-increment: list-2;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-2:before {" +
            "  content: counter(list-2, lower-roman) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-2 {" +
            "  counter-reset: list-3 list-4 list-5 list-6 list-7 list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-3 {" +
            "  counter-increment: list-3;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-3:before {" +
            "  content: counter(list-3, decimal) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-3 {" +
            "  counter-reset: list-4 list-5 list-6 list-7 list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-4 {" +
            "  counter-increment: list-4;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-4:before {" +
            "  content: counter(list-4, lower-alpha) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-4 {" +
            "  counter-reset: list-5 list-6 list-7 list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-5 {" +
            "  counter-increment: list-5;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-5:before {" +
            "  content: counter(list-5, lower-roman) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-5 {" +
            "  counter-reset: list-6 list-7 list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-6 {" +
            "  counter-increment: list-6;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-6:before {" +
            "  content: counter(list-6, decimal) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-6 {" +
            "  counter-reset: list-7 list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-7 {" +
            "  counter-increment: list-7;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-7:before {" +
            "  content: counter(list-7, lower-alpha) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-7 {" +
            "  counter-reset: list-8 list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-8 {" +
            "  counter-increment: list-8;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-8:before {" +
            "  content: counter(list-8, lower-roman) '. ';" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-8 {" +
            "  counter-reset: list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-9 {" +
            "  counter-increment: list-9;" +
            "}" +
            ".ql-editor ol li[class*='ql-indent'].ql-indent-9:before {" +
            "  content: counter(list-9, decimal) '. ';" +
            "}" +
            ".ql-editor .ql-indent-1:not(.ql-direction-rtl) {" +
            "  padding-left: 3em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-1:not(.ql-direction-rtl) {" +
            "  padding-left:30px;" +
            "}" +
            ".ql-editor .ql-indent-1.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 3em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-1.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 30px;" +
            "}" +
            ".ql-editor .ql-indent-2:not(.ql-direction-rtl) {" +
            "  padding-left: 6em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-2:not(.ql-direction-rtl) {" +
            "  padding-left: 60px;" +
            "}" +
            ".ql-editor .ql-indent-2.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 6em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-2.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 60px;" +
            "}" +
            ".ql-editor .ql-indent-3:not(.ql-direction-rtl) {" +
            "  padding-left: 9em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-3:not(.ql-direction-rtl) {" +
            "  padding-left: 90px;" +
            "}" +
            ".ql-editor .ql-indent-3.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 9em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-3.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 90px;" +
            "}" +
            ".ql-editor .ql-indent-4:not(.ql-direction-rtl) {" +
            "  padding-left: 12em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-4:not(.ql-direction-rtl) {" +
            "  padding-left: 120px;" +
            "}" +
            ".ql-editor .ql-indent-4.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 12em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-4.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 120px;" +
            "}" +
            ".ql-editor .ql-indent-5:not(.ql-direction-rtl) {" +
            "  padding-left: 15em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-5:not(.ql-direction-rtl) {" +
            "  padding-left: 150px;" +
            "}" +
            ".ql-editor .ql-indent-5.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 15em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-5.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 150px;" +
            "}" +
            ".ql-editor .ql-indent-6:not(.ql-direction-rtl) {" +
            "  padding-left: 18em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-6:not(.ql-direction-rtl) {" +
            "  padding-left: 180px;" +
            "}" +
            ".ql-editor .ql-indent-6.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 18em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-6.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 180px;" +
            "}" +
            ".ql-editor .ql-indent-7:not(.ql-direction-rtl) {" +
            "  padding-left: 21em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-7:not(.ql-direction-rtl) {" +
            "  padding-left: 210px;" +
            "}" +
            ".ql-editor .ql-indent-7.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 21em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-7.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 210px;" +
            "}" +
            ".ql-editor .ql-indent-8:not(.ql-direction-rtl) {" +
            "  padding-left: 24em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-8:not(.ql-direction-rtl) {" +
            "  padding-left: 240px;" +
            "}" +
            ".ql-editor .ql-indent-8.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 24em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-8.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 240px;" +
            "}" +
            ".ql-editor .ql-indent-9:not(.ql-direction-rtl) {" +
            "  padding-left: 27em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-9:not(.ql-direction-rtl) {" +
            "  padding-left: 270px;" +
            "}" +
            ".ql-editor .ql-indent-9.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 27em;" +
            "}" +
            ".ql-editor li[class*='ql-indent'].ql-indent-9.ql-direction-rtl.ql-align-right {" +
            "  padding-right: 270px;" +
            "}" +
            ".ql-editor .ql-video {" +
            "  display: block;" +
            "  max-width: 100%;" +
            "}" +
            ".ql-editor .ql-video.ql-align-center {" +
            "  margin: 0 auto;" +
            "}" +
            ".ql-editor .ql-video.ql-align-right {" +
            "  margin: 0 0 0 auto;" +
            "}" +
            ".ql-editor .ql-bg-black {" +
            "  background-color: #000;" +
            "}" +
            ".ql-editor .ql-bg-red {" +
            "  background-color: #e60000;" +
            "}" +
            ".ql-editor .ql-bg-orange {" +
            "  background-color: #f90;" +
            "}" +
            ".ql-editor .ql-bg-yellow {" +
            "  background-color: #ff0;" +
            "}" +
            ".ql-editor .ql-bg-green {" +
            "  background-color: #008a00;" +
            "}" +
            ".ql-editor .ql-bg-blue {" +
            "  background-color: #06c;" +
            "}" +
            ".ql-editor .ql-bg-purple {" +
            "  background-color: #93f;" +
            "}" +
            ".ql-editor .ql-color-white {" +
            "  color: #fff;" +
            "}" +
            ".ql-editor .ql-color-red {" +
            "  color: #e60000;" +
            "}" +
            ".ql-editor .ql-color-orange {" +
            "  color: #f90;" +
            "}" +
            ".ql-editor .ql-color-yellow {" +
            "  color: #ff0;" +
            "}" +
            ".ql-editor .ql-color-green {" +
            "  color: #008a00;" +
            "}" +
            ".ql-editor .ql-color-blue {" +
            "  color: #06c;" +
            "}" +
            ".ql-editor .ql-color-purple {" +
            "  color: #93f;" +
            "}" +
            ".ql-editor .ql-font-serif {" +
            "  font-family: Georgia, Times New Roman, serif;" +
            "}" +
            ".ql-editor .ql-font-monospace {" +
            "  font-family: Monaco, Courier New, monospace;" +
            "}" +
            ".ql-editor .ql-size-small {" +
            "  font-size: 0.75em;" +
            "}" +
            ".ql-editor .ql-size-large {" +
            "  font-size: 1.5em;" +
            "}" +
            ".ql-editor .ql-size-huge {" +
            "  font-size: 2.5em;" +
            "}" +
            ".ql-editor .ql-direction-rtl {" +
            "  direction: rtl;" +
            "  text-align: inherit;" +
            "}" +
            ".ql-editor .ql-align-center {" +
            "  text-align: center;" +
            "}" +
            ".ql-editor .ql-align-justify {" +
            "  text-align: justify;" +
            "}" +
            ".ql-editor .ql-align-right {" +
            "  text-align: right;" +
            "}" +
            ".ql-editor > p:first-child:empty {" +
            "  display: none;" +
            "}</style>";
        
        return css;
    }
    
    @Override
    public String getBuilderJavaScriptTemplate() {
        return "{'dragHtml' : '<div class=\"content-placeholder\"></div>', 'inlineEditor' : {'selector' : '> .ui-html','property' : 'content', 'mode' : 'full'}}";
    }
}
