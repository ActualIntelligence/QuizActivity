package quizactivity.rcs27875.jtk2512.email.vccs.edu.quizactivity;

/**
 * Created by Raleigh on 2/19/2018.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue)
    {
        setTextResId(textResId);
        setAnswerTrue(answerTrue);
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
