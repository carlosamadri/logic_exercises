let n1 = 0;
let n2 = 1;
let next;
let i;
let number;

while (true) {
    let input = prompt("Enter a number:");
    number = parseInt(input);

    if (!isNaN(number)) {
        break;
    } else {
        alert("Enter a valid number.");
    }
}
document.write(number + "<br>");

for (i = 1; i <= number; i++) {
    document.write(n1);

    if (i < number) {
        document.write(", ");
    } else {
        document.write(".");
    }

    next = n1 + n2;
    n1 = n2;
    n2 = next;
}