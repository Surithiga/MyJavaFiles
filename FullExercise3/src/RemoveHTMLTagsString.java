public class RemoveHTMLTagsString {
    public static void main(String[] args) {
        String tag="<v><s>Welcome to java Programming</v></s>";
        System.out.println("before removing html tags: " + tag);
        tag = tag.replaceAll("/<*?/>","");
        System.out.println("after removing html tags:" + tag);
    }
}
