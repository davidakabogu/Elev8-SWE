// console.log(
//   "This is displayed from an external js file but only in the console"
// );
// document.writeln(
//   "This will be displayed on the browser using the document.writeln which is an object(document) and a method(writeln) within the object"
// );

// document.writeln("<h2> is this js internally using an html tag ? </h2>");
// document.writeln("Damn it really is haha <br>");

// var humanName = "David King";
// var a = "50";
// document.writeln("My name is " + humanName + "<br>");

// let name;
// name = prompt("Enter your name ");
// document.writeln("Welcome " + name);

// let num1 = 20;
// let num2 = 50;

// let num1 = parseInt(prompt("Enter num1"));
// let num2 = parseInt(prompt("Enter num2"));
// let answer = num1 + num2;
// document.writeln("<h2> This is the answer: " + answer + "</h2>");

// for (i = 0; i < 5; i++) {
//   document.writeln("Javascript is the bomb <br>");
// }

// let i = 0;
// while (i < 12) {
//     document.writeln(i)
//     i++;
// }

// let name = prompt("Enter your name");
// function greeting(name) {
//   document.writeln("<h2> You are welcome " + name + "</h2>");
// }
// greeting(name)

// let word = new String("accomodation");
// document.writeln("word is " + word + "<br>");
// let wd = word.toUpperCase();
// document.writeln("wd is " + wd + "<br>");
// let loc1 = wd.indexOf("O");
// let loc2 = wd.lastIndexOf("O");
// let loc3 = word.indexOf("o", 4)
// document.writeln("The loc1 index is " + loc1 + "<br>");
// document.writeln("The loc2 index is " + loc2 + "<br>");
// document.writeln("The loc3 index is " + loc3 + "<br>");
// let item = word.split("o");
// document.writeln("The word without o is " + item + "<br>");

// let unLabelElt = document.getElementById("unLabel")
// let newLabel = unLabelElt.textContent.toUpperCase()
// unLabelElt.innerText = newLabel;

let labelArray = document.getElementsByTagName("label");
for (let i = 0; i < labelArray.length; i++) {
    labelArray[i].innerText = labelArray[i].innerText.toUpperCase()
}
