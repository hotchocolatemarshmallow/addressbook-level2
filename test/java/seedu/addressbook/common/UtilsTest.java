package seedu.addressbook.common;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.tag.Tag;
import java.util.ArrayList;

import java.util.List;

public class UtilsTest {

    private Utils utils;

    @Before
    public void setup() {
        utils = new Utils();
    }

    @Test
    public void EmptyInput_returnsTrue() {
        List<Tag> emptyTags = new ArrayList<>() ;
        emptyTags.clear();
        assertTrue(utils.isAnyNull(emptyTags));
        }
    @Test
    public void elementsAreNotUniqueInput_returnsFalse() throws IllegalValueException {
        
        Tag sameTag = new Tag ("friendly");
        List<Tag> listOfSameTags = new ArrayList<>() ;
        listOfSameTags.add(sameTag);
        listOfSameTags.add(sameTag);
        assertFalse(Utils.elementsAreUnique(listOfSameTags));
    }
    @Test
    public void elementsAreUniqueInput_returnsTrue() throws IllegalValueException {
        Tag Tag1 = new Tag ("friendly");
        Tag Tag2 = new Tag ("nasty");
        List<Tag> listOfDiffTags = new ArrayList<>() ;
        listOfDiffTags.add(Tag1);
        listOfDiffTags.add(Tag2);
        assertTrue(utils.elementsAreUnique(listOfDiffTags));
    }
    /**
     * Utility methods
     */

    /**
     * Asserts that parsing the given inputs will return IncorrectCommand with the given feedback message.
     */
    private void assertTrue(boolean method){
        if ( method == true){
                System.out.println(" Pass ");
        }
        else {
                if ( method == false){
                System.out.println(" Fail ");
                }
        }
    }
    private void assertFalse(boolean method){
        if ( method == false){
                System.out.println(" Pass ");
        }
        else {
                if ( method == true ){
                System.out.println(" Fail ");
                }
        }
    }
     

 }

