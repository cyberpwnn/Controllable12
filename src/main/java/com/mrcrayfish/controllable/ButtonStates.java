package com.mrcrayfish.controllable;

import com.mrcrayfish.controllable.client.Buttons;

/**
 * Author: MrCrayfish
 */
public class ButtonStates
{
    private boolean[] states;

    public ButtonStates()
    {
        this.states = new boolean[Buttons.LENGTH];
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < states.length; i++){
            sb.append(states[i] ? "1" : "0");
        }

        return sb.toString();
    }

    public boolean getState(int index)
    {
        if(index < 0 || index >= states.length)
            return false;
        return this.states[index];
    }

    protected void setState(int index, boolean state)
    {
        if(index < 0 || index >= states.length)
        {
            return;
        }

        this.states[index] = state;
    }

    public int getSize()
    {
        return this.states.length;
    }
}
