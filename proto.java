    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_A : setAnswerAsAOnThisQuestion();break;
            case KeyEvent.VK_B : setAnswerAsBOnThisQuestion();break;
            case KeyEvent.VK_C : setAnswerAsCOnThisQuestion();break;
            case KeyEvent.VK_D : setAnswerAsDOnThisQuestion();break;
            case KeyEvent.VK_E : setAnswerAsEOnThisQuestion();break;
            default            : break;
        }
    }   