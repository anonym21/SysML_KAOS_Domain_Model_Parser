package SysMLKaosDomainModeling.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.scope.SimpleRoleScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.CompositeScope;
import jetbrains.mps.smodel.SNodePointer;

public class RelationAtom_Constraints extends BaseConstraintsDescriptor {
  public RelationAtom_Constraints() {
    super(MetaAdapterFactory.getConcept(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, "SysMLKaosDomainModeling.structure.RelationAtom"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e0bL, "antecedent"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e0bL), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_2hb9rm_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            if ((SLinkOperations.getTarget(_context.getReferenceNode(), MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e09L, "relation")) == null)) {
              SimpleRoleScope.forNamedElements(SNodeOperations.cast(SNodeOperations.getParent(SNodeOperations.getParent(_context.getReferenceNode())), MetaAdapterFactory.getConcept(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, "SysMLKaosDomainModeling.structure.Predicate")), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f58146957014bL, "variables"));

            }

            return CompositeScope.createComposite(SimpleRoleScope.forNamedElements(SNodeOperations.cast(SNodeOperations.getParent(SNodeOperations.getParent(_context.getReferenceNode())), MetaAdapterFactory.getConcept(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, "SysMLKaosDomainModeling.structure.Predicate")), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f58146957014bL, "variables")), SimpleRoleScope.forNamedElements(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getReferenceNode(), MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e09L, "relation")), MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f58146949824cL, 0x506f58146949829bL, "domain")), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469497f85L, 0x506f5814694983aeL, "individuals")));


          }
        };
      }
    });
    references.put(MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e0eL, "image"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e0eL), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_2hb9rm_a0a0a0a0a1a0b0a2a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            if ((SLinkOperations.getTarget(_context.getReferenceNode(), MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e09L, "relation")) == null)) {
              SimpleRoleScope.forNamedElements(SNodeOperations.cast(SNodeOperations.getParent(SNodeOperations.getParent(_context.getReferenceNode())), MetaAdapterFactory.getConcept(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, "SysMLKaosDomainModeling.structure.Predicate")), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f58146957014bL, "variables"));

            }

            return CompositeScope.createComposite(SimpleRoleScope.forNamedElements(SNodeOperations.cast(SNodeOperations.getParent(SNodeOperations.getParent(_context.getReferenceNode())), MetaAdapterFactory.getConcept(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, "SysMLKaosDomainModeling.structure.Predicate")), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469498113L, 0x506f58146957014bL, "variables")), SimpleRoleScope.forNamedElements(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getReferenceNode(), MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f5814694e5e08L, 0x506f5814694e5e09L, "relation")), MetaAdapterFactory.getReferenceLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f58146949824cL, 0x506f58146949829eL, "range")), MetaAdapterFactory.getContainmentLink(0x9715e310dbcb448eL, 0x93035bfaafdcf84dL, 0x506f581469497f85L, 0x506f5814694983aeL, "individuals")));


          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_2hb9rm_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:fe29ccbb-7e61-4fdd-9719-8bc60c7c67be(SysMLKaosDomainModeling.constraints)", "1155482233029776799");
  private static SNodePointer breakingNode_2hb9rm_a0a0a0a0a1a0b0a2a2 = new SNodePointer("r:fe29ccbb-7e61-4fdd-9719-8bc60c7c67be(SysMLKaosDomainModeling.constraints)", "1155482233029780644");
}
