package com.github.pvlvsoft.Action.triggers;


import java.util.List;


/**
 * <i>AUTHOR OF THIS PROJECT IS NOT RESPONSIBLE FOR ANY DAMAGE TO
 * THE USER'S DEVICE CAUSED BY USING THIS SOFTWARE, NO DATA LEAKS
 * OR DATA INTEGRITY DAMAGE.</i>
 *
 * <i>THIS PIECE OF SOFTWARE WAS MADE WITH NO GUARANTEE AND SHOULD
 * NOT BE USED FOR CRITICAL INFRASTRUCTURE OF YOUR APPS. THIS
 * PROJECT WAS CREATED JUST FOR FUN.</i>
 *
 *
 * <p>Interface of {@link Publisher} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-12-16
 */
public interface Publisher {

    /**
     * <p>This method is responsible for the list of {@link Observer}s
     * returning.</p>
     *
     * @return  {@link List} of {@link Observer}s
     */
    public List<Observer> getObservers();


    /**
     * <p>This method notifies all the observers in the {@link List}.</p>
     *
     * <p>This method should work as a base of the {@code Observer} design pattern.</p>
     */
    default void notifyObservers() {

        for (Observer observer : this.getObservers()) {

            observer.go();
        }
    }


    
}
