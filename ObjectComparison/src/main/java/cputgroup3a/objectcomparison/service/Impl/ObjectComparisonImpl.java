/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.objectcomparison.service.Impl;

/**
 *
 * @author kurvin
 */

import cputgroup3a.objectcomparison.service.ObjectComparison;

public class ObjectComparisonImpl implements ObjectComparison{
    
    public static ObjectComparison obj1;
    
    @Override
    public ObjectComparison checkObject(ObjectComparison obj2){
        return (obj1 = obj2);
    }
    
    
}
