// Q3
// Sort array

let unsortedArray = [9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 10, 16, 99, 12, 15];

function sortArray(array) {
    if (array.length <= 1) {
        return array;
    }

    let minIndex = 0; // To keep track of the minimum value
    for (let i = 1; i < array.length; i++) {
        if (array[i] < array[minIndex]) { // If the current value is less than the minimum value
            minIndex = i;                 // Update the minimum value index
        }
    }

    const minValue = array.splice(minIndex, 1)[0]; // Remove the minimum value from the array
    return [minValue].concat(sortArray(array));    // Concatenate the minimum value with the sorted array
}                                                 // Repeat until the array is sorted

console.log(sortArray(unsortedArray)); // Complexity: O(n^2)