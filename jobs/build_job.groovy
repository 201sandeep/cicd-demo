job('prod_FE_Deploy') {
  description('I\'ll do continuous deployment of all componets availble in Project_Frontend.')
parameters {
     choiceParam('AZ', ['a', 'b',  ],  )
      stringParam('RELEASE_ID', 'Auto')
}
  steps {
    shell(
    'echo $AZ'
    )}
}


job('prod_BE_API_Deploy') {
  description('I\'ll do continuous deployment of all componets availble in Project_Backendend.')
parameters {
     choiceParam('AZ', ['a', 'b',  ],  )
      stringParam('RELEASE_ID', 'Auto')
}
  steps {
    shell(
    'echo $AZ'
    )}
}


job('prod_BE_connectors_Deploy') {
  description('I\'ll do continuous deployment of all componets availble in Project_Backend.')
parameters {
     choiceParam('AZ', ['a', 'b',  ],  )
      stringParam('RELEASE_ID', 'Auto')
}
  steps {
    shell(
    'echo $AZ'
    )}
}


job('prod_BE_crud_Deploy') {
  description('I\'ll do continuous deployment of all componets availble in Project_Backend.')
parameters {
     choiceParam('AZ', ['a', 'b',  ],  )
      stringParam('RELEASE_ID', 'Auto')
}
  steps {
    shell(
    'echo $AZ'
    )}
}


job('prod_BE_jobsculders_Deploy') {
  description('I\'ll do continuous deployment of all componets availble in Project_backend.')
parameters {
     choiceParam('AZ', ['a', 'b',  ],  )
      stringParam('RELEASE_ID', 'Auto')
}
  steps {
    shell(
     'echo $AZ'
    )}
}


job('Disable_Autoscaling') {
  description('Job for Disable Autoscaling')
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Disabling Autoscaling ')
            }
}

job('Pullout_AzB_Instances') {
  description('Pullout AzB Instances from ELB')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Pullout AzB Instances ')
            }
}


job('Test_AzB_Environment') {
  description('Connecting with testing ELB')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Testing AzB Environment ')
            }
}

job('Rollback_AzB_Instances') {
  description('Rollback AzB on Instances')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Rollback AzB Instance ')
            }
}

job('Join_AzB_Instances') {
  description('Remove from testing ELB Join AzB Instance with ELB')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Removing testing ELB ')
            }
}

job('Pullout_AzA_Instances') {
  description('Pullout AzA Instances from ELB')
 
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Pulling Out AzA ')
            }
}

job('Test_AzA_Environment') {
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Testing AzA Environment ')
            }
}

job('Manual_Rollback') {
  description('Manual Rollback Environment AzA/AzB')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Manual Rollback ')
            }
}

job('Join_AzA_Environment') {
  description('Remove from testing ELB and Join AzA Environment')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Joining AzA Environment ')
            }
}

job('Test_Whole_Environment') {
  description('Testing for whole Environment')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Testing Whole Environment ')
            }
}

job('Run_Artifact_Job') {
  description('Run artifact job')
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Running Artifact Job ')
            }
}

job('Enable_Autoscaling') {
  description('Enable autoscaling')

  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Enabling Autoscaling ')
            }
}

job('Disable_Autoscaling') {
  description('Job for Disable Autoscaling')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Disabling Autoscaling ')
            }
}

job('Pullout_AzB_Instances') {
  description('Pullout AzB Instances from ELB')
 
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Pullout AzB Instances ')
            }
}

job('Test_AzB_Environment') {
  description('Connecting with testing ELB')
 
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Testing AzB Environment ')
            }
}

job('Rollback_AzB_Instances') {
  description('Rollback AzB on Instances')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Rollback AzB Instance ')
            }
}

job('Join_AzB_Instances') {
  description('Remove from testing ELB Join AzB Instance with ELB')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Removing testing ELB ')
            }
}

job('Pullout_AzA_Instances') {
  description('Pullout AzA Instances from ELB')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Pulling Out AzA ')
            }
}

job('Test_AzA_Environment') {
  description('Connecting with testing ELB and Test AzA Environment')

  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Testing AzA Environment ')
            }
}

job('Manual_Rollback') {
  description('Manual Rollback Environment AzA/AzB')
 
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Manual Rollback ')
            }
}

job('Join_AzA_Environment') {
  description('Remove from testing ELB and Join AzA Environment')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Joining AzA Environment ')
            }
}

job('Test_Whole_Environment') {
  description('Testing for whole Environment')
  
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Testing Whole Environment ')
            }
}

job('Run_Artifact_Job') {
  description('Run artifact job')
 
  logRotator {
    	daysToKeep(60)
    	numToKeep(20)
    	artifactDaysToKeep(1)
	}
    steps {
                shell(' echo Running Artifact Job ')
            }
}


pipelineJob('Pipeline_Deploy') {
  def repo = 'https://github.com/OpsTree/cicd-demo.git'

  
  description("Pipeline for $repo")

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('*/master')
          scriptPath('pipeline_data')
          extensions { }
        }
      }
    }
  }
}



  
nestedView('New-Rolling') {
   views {
       nestedView('Rolling-Prod') {
           views {
           listView('Rolling_BigParser_Frontend') {
                jobs {
                      name("prod_FE_Deploy")
                }
                columns {
               status()
               weather()
               name()
               lastSuccess()
               lastFailure()
       }
       
            }
             
       listView('Rolling_BigParser_Backend') {
                jobs {
                      names("prod_BE_API_Deploy","prod_BE_connectors_Deploy","prod_BE_crud_Deploy","prod_BE_jobsculders_Deploy")
                }
                columns {
               status()
               weather()
               name()
               lastSuccess()
               lastFailure()
       }
       
            }
             
             
             
        listView('Rolling_BigParser_ELB_Autoscaling') {
                jobs {
                  names("Disable_Autoscaling","Pullout_AzB_Instances","Test_AzB_Environment","Rollback_AzB_Instances","Join_AzB_Instances","Pullout_AzA_Instances","Test_AzA_Environment","Manual_Rollback","Join_AzA_Environment","Test_Whole_Environment","Run_Artifact_Job","Enable_Autoscaling","Disable_Autoscaling","Pullout_AzB_Instances","Test_AzB_Environment","Rollback_AzB_Instances","Join_AzB_Instances","Pullout_AzA_Instances","Test_AzA_Environment","Manual_Rollback","Join_AzA_Environment","Test_Whole_Environment","Run_Artifact_Job","Pipeline1","Rolling_Accept_reject")
                }
          columns {
               status()
               weather()
               name()
               lastSuccess()
               lastFailure()
       }
             
           }
       }
   }
 }
}

