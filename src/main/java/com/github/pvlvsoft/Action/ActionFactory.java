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
 * <p>Interface of {@link ActionFactory} defines a basic set of signatures
 * of methods overridden by it's descendants.</p>
 *
 *
 * <p></p>
 *
 * @author Vojtech Pavlu
 * @version 2020-12-16
 */
public interface ActionFactory {

    /**
     * <p>This method generates the given {@link Action} and passes it back.</p>
     *
     * @return {@link Action} instance to be initiated.
     */
    public Action create();
}
