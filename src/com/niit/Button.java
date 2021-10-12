package com.niit;

public class Button {
    public void addEventListener(String eventName, OnEventListener eventListener) {
        switch (eventName) {
            case "click":
                eventListener.onClick();
                break;

            case "keyup":
                eventListener.onKeyUp();
                break;


            case "keydown":
                eventListener.onKeyDown();
                break;

        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.addEventListener("click", new OnEventListener() {
            @Override
            public void onClick() {
                System.out.println("You click on the button");
            }

            @Override
            public void onKeyUp() {

            }

            @Override
            public void onKeyDown() {

            }
        });
    }
}
