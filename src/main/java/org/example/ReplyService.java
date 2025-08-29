package org.example;

public class ReplyService {
    public String reply(String message, ReplyType type) {
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        String trimmedMessage = message.trim().toLowerCase();

        switch (type) {
            case FORMAL:
                return getFormalReply(trimmedMessage);
            case FRIENDLY:
                return getFriendlyReply(trimmedMessage);
            case CONCISE:
                return getConciseReply(trimmedMessage);
            default:
                return "Please say something.";
        }
    }

    private String getFormalReply(String message) {
        switch (message) {
            case "hi":
            case "hello":
                return "Hello. How may I assist you today?";
            case "how are you":
                return "I am functioning properly. How may I assist you?";
            case "i need help":
                return "I can assist with that. Please provide more details.";
            case "can you help me with my account":
                return "Certainly. Please describe the account issue.";
            case "thanks":
                return "You are welcome.";
            case "bye":
                return "Goodbye.";
            case "what is your name":
                return "I am your virtual assistant.";
            default:
                return "Could you clarify your request?";
        }
    }

    private String getFriendlyReply(String message) {
        switch (message) {
            case "hi":
                return "Hey there! 😊 How can I help?";
            case "hello":
                return "Hi! 👋 What’s up?";
            case "how are you":
                return "Doing great! 😄 How can I help?";
            case "i need help":
                return "I’ve got you! 🙂 Tell me a bit more.";
            case "can you help me with my account":
                return "Sure thing! 😊 What’s wrong with the account?";
            case "thanks":
                return "Anytime! 🙌";
            case "bye":
                return "See you later! 👋";
            case "what is your name":
                return "I’m your helper bot 🤖";
            default:
                return "Could you tell me more?";
        }
    }

    private String getConciseReply(String message) {
        switch (message) {
            case "hi":
            case "hello":
                return "Hello. How can I help?";
            case "how are you":
                return "I’m good. How can I help?";
            case "i need help":
                return "Share details; I’ll help.";
            case "can you help me with my account":
                return "Describe the account issue…";
            case "thanks":
                return "You’re welcome.";
            case "bye":
                return "Goodbye.";
            case "what is your name":
                return "I’m your assistant.";
            default:
                return "Please clarify.";
        }
    }
}
