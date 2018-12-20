/*
 * This file is part of Titanium
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * This means no, you cannot steal this code. This is licensed for sole use by Horizon Studio and its subsidiaries, you MUST be granted specific written permission by Horizon Studio to use this code, thinking you have permission IS NOT PERMISSION!
 */
package com.hrznstudio.titanium.util;

public class ModHacks {
    /*
    public static class ModEventHandlerHack {
        private static final Field FIELD = getField();

        public static void doHack(Object instance) {
            addModEventHandlerMethods((FMLModContainer) Loader.instance().activeModContainer(), instance.getClass());
        }

        static void doHack(TitaniumMod instance) {
            Loader.instance().getModList().stream()
                    .filter(modContainer -> modContainer instanceof FMLModContainer)
                    .filter(modContainer -> modContainer.getModId().equals(instance.getModId()))
                    .forEach(modContainer -> addModEventHandlerMethods((FMLModContainer) modContainer, TitaniumMod.class));
        }

        @SuppressWarnings("unchecked")
        private static void addModEventHandlerMethods(FMLModContainer modContainer, Class tClass) {
            ListMultimap<Class<? extends FMLEvent>, Method> methodMap = getModEventMap(modContainer);
            for (Method method : getMethods(tClass)) {
                Class<? extends FMLEvent> paramClass = (Class<? extends FMLEvent>) method.getParameterTypes()[0];
                methodMap.put(paramClass, method);
            }
        }

        @SuppressWarnings("unchecked")
        private static ListMultimap<Class<? extends FMLEvent>, Method> getModEventMap(FMLModContainer modContainer) {
            try {
                FIELD.setAccessible(true);
                return (ListMultimap<Class<? extends FMLEvent>, Method>) FIELD.get(modContainer);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private static List<Method> getMethods(Class tClass) {
            List<Method> foundMethods = new ArrayList<>();
            for (Method method : tClass.getDeclaredMethods()) {
                for (Annotation a : method.getAnnotations()) {
                    if (a.annotationType().equals(Mod.EventHandler.class)) {
                        if (method.getParameterTypes().length == 1 && FMLEvent.class.isAssignableFrom(method.getParameterTypes()[0])) {
                            method.setAccessible(true);
                            foundMethods.add(method);
                        }
                    }
                }
            }
            return ImmutableList.copyOf(foundMethods);
        }

        private static Field getField() {
            try {
                return FMLModContainer.class.getDeclaredField("eventMethods");
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }
    }*/
}