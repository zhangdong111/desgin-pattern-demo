package com.zhang.design.patterns.creator.builder.demo1.carmodel;

import java.util.List;

public class BenChiCarModel extends  AbstractCarModel{


    private List<String> sequence;

    @Override
    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }

    public List<String> getSequence(){
        return this.sequence;
    }

    @Override
    public void run() {
        String action = null;
        for (String s : this.sequence) {
            action = s;
            switch (action) {
                case START:
                    super.start();
                    break;
                case STOP:
                    super.stop();
                    break;
                case ALARM:
                    super.alarm();
                    break;
                default:
                    break;
            }
//            if(action.equals(AbstractCarModel.START)){
//                super.start();
//            }
//            if(action.equals(AbstractCarModel.STOP)){
//                super.stop();
//            }
//            if(action.equals(AbstractCarModel.ALARM)){
//                super.alarm();
//            }

        }
    }
}
