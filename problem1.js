//https://codeforces.com/problemset/gymProblem/102961/G

// G. Sum of Two Values
// time limit per test: 2 seconds
// memory limit per test: 256 megabytes
// You are given an array of n integers, and your task is to find two values (at distinct positions) whose sum is x.

// Input
// The first input line has two integers n and x: the array size and the target sum.

// The second line has n integers a1,a2,…,an: the array values.

// Constraints:

// 2 ≤ n ≤ 2⋅10^5
// 1≤ x,ai ≤ 10^9
// Output
// Print two integers: the positions of the values. If there are several solutions, you may print any of them. If there are no solutions, print −1.


function findTwoValuesWithSum(n, nums, target) {
  const numToIndexMap = {};

  for (let i = 0; i < n; i++) {
    const complement = target - nums[i];

    if (numToIndexMap.hasOwnProperty(complement)) {
      const complementIndex = numToIndexMap[complement] + 1;
      const currentIndex = i + 1;
      return [complementIndex, currentIndex];
    }

    numToIndexMap[nums[i]] = i;
  }

  return -1;
}

// Test the function
const n = 4;
const inputArray = [2, 7, 5, 1];
const targetSum = 8;
const result = findTwoValuesWithSum(n, inputArray, targetSum);
console.log(result);