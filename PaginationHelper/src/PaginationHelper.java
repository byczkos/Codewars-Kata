//    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
//    helper.pageCount(); //should == 2
//    helper.itemCount(); //should == 6
//    helper.pageItemCount(0); //should == 4
//    helper.pageItemCount(1); // last page - should == 2
//    helper.pageItemCount(2); // should == -1 since the page is invalid
//
//    // pageIndex takes an item index and returns the page that it belongs on
//    helper.pageIndex(5); //should == 1 (zero based index)
//    helper.pageIndex(2); //should == 0
//    helper.pageIndex(20); //should == -1
//    helper.pageIndex(-10); //should == -1

//    URL: https://www.codewars.com/kata/paginationhelper

import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I> {

    private int lengthOfPage = 0;
    private List<I> list = new ArrayList<>();

    /**
     * The constructor takes in an array of items and a integer indicating how
     * many items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        lengthOfPage = itemsPerPage;
        list = collection;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return list.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (lengthOfPage != 0) {
            return Math.floorDiv(list.size(), lengthOfPage) + 1;
        }
        return -1;
    }

    /**
     * returns the number of items on the current page. page_index is zero
     * based. this method should return -1 for pageIndex values that are out of
     * range
     */
    public int pageItemCount(int pageIndex) {
        int fullPages = Math.floorDiv(list.size(), lengthOfPage);
        if (pageIndex < fullPages) {
            return lengthOfPage;
        } else if (pageIndex == fullPages) {
            return list.size() % lengthOfPage;
        }
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes this method should
     * return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (list.size() <= 0 || itemIndex > list.size() || itemIndex < 0) {
            return -1;
        } 
        if (itemIndex == 0) {
            return 0;
        }
        return Math.floorDiv(itemIndex, lengthOfPage);
    }
}
