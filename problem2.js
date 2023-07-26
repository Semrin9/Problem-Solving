/* The JoMail is a new email service like Gmail and Outlook email service providers, and soon, this email service will be launched in the marketplace.

The chief technology officer needs to implement the prototype of the site registration system by applying the system requirements as the following:
Each time a new user wants to register, he sends his name in the system request; if such a name does not exist in the system database,
it is inserted into the database, and the user gets the response OK, confirming the successful registration. If the name already exists in the system database,
the system creates a new user name, sends it to the user as a prompt, and inserts the prompt into the database. The new name is formed by the following rule.
Numbers starting with 1 are appended one after another to name (name1, name2, ...); among these numbers, the least (i) is found, so that name does not yet exist in the database.

Could you help the CTO to implement the logic for this email service?

Input Format:
The first line contains number n (1 ≤ n ≤ 105). The following n lines contain the requests to the system. Each request is a non-empty line,
and consists of not more than 32 characters, which are all lowercase Latin letters.

Output Format:
Print n lines, which are system responses to the requests:
OK in case of successful registration, or a prompt with a new name, if the requested name is already taken.

Sample Input 0:
4
abacaba
acaba
abacaba
acab
Sample Output 0

OK
OK
abacaba1
OK

Sample Input 1:
5
first
first
second
second
first
Sample Output 1

OK
first1
OK
second1
first2 */

function processRegistrationRequests(n, requests) {
  const nameMap = new Map();
  const responses = [];

  function findAvailableName(name) {
    let i = 1;
    while (nameMap.has(name + i)) {
      i++;
    }
    return name + i;
  }

  for (let i = 0; i < n; i++) {
    const name = requests[i];

    if (!nameMap.has(name)) {
      nameMap.set(name, 1);
      responses.push("OK");
    } else {
      const newName = findAvailableName(name);
      nameMap.set(newName, 1);
      responses.push(newName);
    }
  }

  return responses;
}

// Sample Input 0
const input0 = [
  "4",
  "abacaba",
  "acaba",
  "abacaba",
  "acab"
];

const n0 = parseInt(input0[0], 10);
const requests0 = input0.slice(1);

const output0 = processRegistrationRequests(n0, requests0);
output0.forEach(response => console.log(response));

// Sample Input 1
const input1 = [
  "5",
  "first",
  "first",
  "second",
  "second",
  "first"
];

const n1 = parseInt(input1[0], 10);
const requests1 = input1.slice(1);

const output1 = processRegistrationRequests(n1, requests1);
output1.forEach(response => console.log(response));