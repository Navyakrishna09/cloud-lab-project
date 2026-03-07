const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Simple Chatbot Started. Type 'exit' to quit.");

function chatbotResponse(input) {
  const text = input.toLowerCase();

  if (text.includes("hello")) return "Hi! How can I help you?";
  if (text.includes("course")) return "This lab teaches chatbot development.";
  if (text.includes("bye")) return "Goodbye!";

  return "Sorry, I didn't understand that.";
}

function ask() {
  rl.question("You: ", (input) => {

    if (input === "exit") {
      rl.close();
      return;
    }

    console.log("Bot:", chatbotResponse(input));
    ask();
  });
}

ask();