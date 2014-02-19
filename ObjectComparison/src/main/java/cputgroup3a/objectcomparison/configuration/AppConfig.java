/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.objectcomparison.configuration;

/**
 *
 * @author kurvin
 */

import cputgroup3a.objectcomparison.service.ObjectComparison;
import cputgroup3a.objectcomparison.service.Impl.ObjectComparisonImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {
    
    @Bean(name="Obj")
    public ObjectComparison getService(){
        return new ObjectComparisonImpl();
    }
}
