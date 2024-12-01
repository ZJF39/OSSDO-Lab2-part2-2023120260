import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution17Test {

    // 测试用例1: 检查具有重复DNA序列的字符串
    @Test
    public void testFRDS_example1() {
        Solution17 solution = new Solution17();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = List.of("AAAAACCCCC", "CCCCCAAAAA");
        List<String> result = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, result);
    }

    // 测试用例2: 检查由相同字符组成的字符串
    @Test
    public void testFRDS_example2() {
        Solution17 solution = new Solution17();
        String s = "AAAAAAAAAAAAA";
        List<String> expected = List.of("AAAAAAAAAA");
        List<String> result = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, result);
    }

    // 测试用例3: 检查没有重复序列的字符串
    @Test
    public void testFRDS_noRepeats() {
        Solution17 solution = new Solution17();
        String s = "ACGTACGTAC";
        List<String> expected = List.of();
        List<String> result = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, result);
    }

    // 测试用例4: 检查短字符串
    @Test
    public void testFRDS_shortString() {
        Solution17 solution = new Solution17();
        String s = "ACG";
        List<String> expected = List.of();
        List<String> result = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, result);
    }

    // 测试用例5: 检查空字符串
    @Test
    public void testFRDS_emptyString() {
        Solution17 solution = new Solution17();
        String s = "";
        List<String> expected = List.of();
        List<String> result = solution.findRepeatedDnaSequences(s);
        assertEquals(expected, result);
    }
}
