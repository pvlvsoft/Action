package com.github.pvlvsoft.Action;


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
 * <p>Interface of {@link ActionTrigger} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-12-16
 */
public interface ActionTrigger {


    /**
     * <p>This method guarantees the {@link ActionFactory} is related
     * to this {@link ActionTrigger} instance and the trigger can
     * create it's {@link Action}s.</p>
     *
     * @return  {@link ActionFactory} this {@link ActionTrigger} is
     *          related to.
     */
    public ActionFactory getActionFactory();


    /**
     * <p>This method provides the ability to change the state of this trigger.
     * It allows the outer world to manage the triggering - to listen to the
     * initiators or to ignore them.</p>
     *
     * @param shouldListen  if {@code true}, the {@link ActionTrigger} will
     *                      listen to the initiators and will create and
     *                      trigger these actions. Otherwise it stops these
     *                      processes.
     */
    public void listen(boolean shouldListen);


    /**
     * <p>Default getter for the {@code shouldListen} field.</p>
     *
     * @return  if this trigger should listen.
     */
    public boolean getListen();


    /**
     * <p>This method begins the process of the {@link Action} creation,
     * triggering and execution.</p>
     *
     * @return  {@link Action} instance which have been created and initiated.
     *          This may be {@code null} - when this {@link ActionTrigger}
     *          is not listening.
     */
    default Action go() {

        Action action = null;

        if(getListen()) {

            action = getActionFactory().create();
            action.execute();
        }

        return action;
    }
}
