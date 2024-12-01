import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * @Description
 * 用于验证 Solution17 类中的 findRepeatedDnaSequences 方法。
 * 测试用例设计原则：
 * 1. 等价类划分原则：将输入数据划分为有效等价类和无效等价类。
 *    - 有效等价类：长度大于等于10的DNA序列。
 *    - 无效等价类：长度小于10的DNA序列。
 * 2. 边界值分析：考虑边界情况，如长度恰好为10的DNA序列，以及长度为11的DNA序列。
 * 3. 组合覆盖：考虑不同字符组合的情况，确保各种可能的字符排列都被测试到。
 */

public class L2023120260_17_Test {

    /**
     * 测试方法：testFindRepeatedDnaSequences_WithMultipleRepeats
     * 测试目的：验证当输入的DNA序列中存在多个长度为10的重复子序列时，方法能够正确识别并返回这些子序列。
     * 测试用例：
     * - 输入："AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
     * - 预期输出：["AAAAACCCCC", "CCCCCAAAAA"]
     */
    @Test
    public void testFindRepeatedDnaSequences_WithMultipleRepeats() {
        Solution17 solution = new Solution17();
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expectedOutput = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> actualOutput = solution.findRepeatedDnaSequences(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * 测试方法：testFindRepeatedDnaSequences_WithSingleRepeat
     * 测试目的：验证当输入的DNA序列中存在一个长度为10的重复子序列时，方法能够正确识别并返回该子序列。
     * 测试用例：
     * - 输入："AAAAAAAAAAAAA"
     * - 预期输出：["AAAAAAAAAA"]
     */
    @Test
    public void testFindRepeatedDnaSequences_WithSingleRepeat() {
        Solution17 solution = new Solution17();
        String input = "AAAAAAAAAAAAA";
        List<String> expectedOutput = Arrays.asList("AAAAAAAAAA");
        List<String> actualOutput = solution.findRepeatedDnaSequences(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * 测试方法：testFindRepeatedDnaSequences_WithNoRepeats
     * 测试目的：验证当输入的DNA序列中不存在任何长度为10的重复子序列时，方法能够返回空列表。
     * 测试用例：
     * - 输入："ACGTACGTACGT"
     * - 预期输出：[]
     */
    @Test
    public void testFindRepeatedDnaSequences_WithNoRepeats() {
        Solution17 solution = new Solution17();
        String input = "ACGTACGTACGT";
        List<String> expectedOutput = new ArrayList<>();
        List<String> actualOutput = solution.findRepeatedDnaSequences(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * 测试方法：testFindRepeatedDnaSequences_WithLengthLessThanTen
     * 测试目的：验证当输入的DNA序列长度小于10时，方法能够返回空列表。
     * 测试用例：
     * - 输入："ACGTACG"
     * - 预期输出：[]
     */
    @Test
    public void testFindRepeatedDnaSequences_WithLengthLessThanTen() {
        Solution17 solution = new Solution17();
        String input = "ACGTACG";
        List<String> expectedOutput = new ArrayList<>();
        List<String> actualOutput = solution.findRepeatedDnaSequences(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * 测试方法：testFindRepeatedDnaSequences_WithLengthExactlyTen
     * 测试目的：验证当输入的DNA序列长度恰好为10且不重复时，方法能够返回空列表。
     * 测试用例：
     * - 输入："ACGTACGTAC"
     * - 预期输出：[]
     */
    @Test
    public void testFindRepeatedDnaSequences_WithLengthExactlyTen() {
        Solution17 solution = new Solution17();
        String input = "ACGTACGTAC";
        List<String> expectedOutput = new ArrayList<>();
        List<String> actualOutput = solution.findRepeatedDnaSequences(input);
        assertEquals(expectedOutput, actualOutput);
    }

    /**
     * 测试方法：testFindRepeatedDnaSequences_WithMixedCharacters
     * 测试目的：验证当输入的DNA序列包含多种字符组合时，方法能够正确识别并返回重复的长度为10的子序列。
     * 测试用例：
     * - 输入："ACGTACGTACGTACGTACGTACGTACGT"
     * - 预期输出：["ACGTACGTAC", "CGTACGTACG", "GTACGTACGT", "TACGTACGTA"]
     */
    @Test
    public void testFindRepeatedDnaSequences_WithMixedCharacters() {
        Solution17 solution = new Solution17();
        String input = "ACGTACGTACGTACGTACGTACGTACGT";
        List<String> expectedOutput = Arrays.asList("ACGTACGTAC", "CGTACGTACG", "GTACGTACGT", "TACGTACGTA");
        List<String> actualOutput = solution.findRepeatedDnaSequences(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
